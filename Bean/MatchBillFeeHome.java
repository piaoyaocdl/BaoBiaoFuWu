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
 * Home object for domain model class MatchBillFee.
 * @see deefw.MatchBillFee
 * @author Hibernate Tools
 */
public class MatchBillFeeHome
{

	private static final Log log = LogFactory.getLog(MatchBillFeeHome.class);

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

	public void persist(MatchBillFee transientInstance)
	{
		log.debug("persisting MatchBillFee instance");
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

	public void attachDirty(MatchBillFee instance)
	{
		log.debug("attaching dirty MatchBillFee instance");
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

	public void attachClean(MatchBillFee instance)
	{
		log.debug("attaching clean MatchBillFee instance");
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

	public void delete(MatchBillFee persistentInstance)
	{
		log.debug("deleting MatchBillFee instance");
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

	public MatchBillFee merge(MatchBillFee detachedInstance)
	{
		log.debug("merging MatchBillFee instance");
		try
		{
			MatchBillFee result = (MatchBillFee) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public MatchBillFee findById(int id)
	{
		log.debug("getting MatchBillFee instance with id: " + id);
		try
		{
			MatchBillFee instance = (MatchBillFee) sessionFactory.getCurrentSession().get("deefw.MatchBillFee", id);
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

	public List<MatchBillFee> findByExample(MatchBillFee instance)
	{
		log.debug("finding MatchBillFee instance by example");
		try
		{
			List<MatchBillFee> results = (List<MatchBillFee>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.MatchBillFee").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
