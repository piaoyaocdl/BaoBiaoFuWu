package deefw;
// Generated 2015-12-29 13:42:13 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ReactionTableRecord.
 * @see deefw.ReactionTableRecord
 * @author Hibernate Tools
 */
public class ReactionTableRecordHome
{

	private static final Log log = LogFactory.getLog(ReactionTableRecordHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory()
	{
		try
		{
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e)
		{
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ReactionTableRecord transientInstance)
	{
		log.debug("persisting ReactionTableRecord instance");
		try
		{
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re)
		{
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ReactionTableRecord instance)
	{
		log.debug("attaching dirty ReactionTableRecord instance");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReactionTableRecord instance)
	{
		log.debug("attaching clean ReactionTableRecord instance");
		try
		{
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ReactionTableRecord persistentInstance)
	{
		log.debug("deleting ReactionTableRecord instance");
		try
		{
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReactionTableRecord merge(ReactionTableRecord detachedInstance)
	{
		log.debug("merging ReactionTableRecord instance");
		try
		{
			ReactionTableRecord result = (ReactionTableRecord) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReactionTableRecord findById(int id)
	{
		log.debug("getting ReactionTableRecord instance with id: " + id);
		try
		{
			ReactionTableRecord instance = (ReactionTableRecord) sessionFactory.getCurrentSession()
					.get("deefw.ReactionTableRecord", id);
			if (instance == null)
			{
				log.debug("get successful, no instance found");
			} else
			{
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ReactionTableRecord> findByExample(ReactionTableRecord instance)
	{
		log.debug("finding ReactionTableRecord instance by example");
		try
		{
			List<ReactionTableRecord> results = (List<ReactionTableRecord>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.ReactionTableRecord").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
