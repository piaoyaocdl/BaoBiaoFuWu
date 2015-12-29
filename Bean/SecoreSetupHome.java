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
 * Home object for domain model class SecoreSetup.
 * @see deefw.SecoreSetup
 * @author Hibernate Tools
 */
public class SecoreSetupHome
{

	private static final Log log = LogFactory.getLog(SecoreSetupHome.class);

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

	public void persist(SecoreSetup transientInstance)
	{
		log.debug("persisting SecoreSetup instance");
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

	public void attachDirty(SecoreSetup instance)
	{
		log.debug("attaching dirty SecoreSetup instance");
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

	public void attachClean(SecoreSetup instance)
	{
		log.debug("attaching clean SecoreSetup instance");
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

	public void delete(SecoreSetup persistentInstance)
	{
		log.debug("deleting SecoreSetup instance");
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

	public SecoreSetup merge(SecoreSetup detachedInstance)
	{
		log.debug("merging SecoreSetup instance");
		try
		{
			SecoreSetup result = (SecoreSetup) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public SecoreSetup findById(int id)
	{
		log.debug("getting SecoreSetup instance with id: " + id);
		try
		{
			SecoreSetup instance = (SecoreSetup) sessionFactory.getCurrentSession().get("deefw.SecoreSetup", id);
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

	public List<SecoreSetup> findByExample(SecoreSetup instance)
	{
		log.debug("finding SecoreSetup instance by example");
		try
		{
			List<SecoreSetup> results = (List<SecoreSetup>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.SecoreSetup").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
