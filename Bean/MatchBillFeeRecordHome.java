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
 * Home object for domain model class MatchBillFeeRecord.
 * @see deefw.MatchBillFeeRecord
 * @author Hibernate Tools
 */
public class MatchBillFeeRecordHome
{

	private static final Log log = LogFactory.getLog(MatchBillFeeRecordHome.class);

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

	public void persist(MatchBillFeeRecord transientInstance)
	{
		log.debug("persisting MatchBillFeeRecord instance");
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

	public void attachDirty(MatchBillFeeRecord instance)
	{
		log.debug("attaching dirty MatchBillFeeRecord instance");
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

	public void attachClean(MatchBillFeeRecord instance)
	{
		log.debug("attaching clean MatchBillFeeRecord instance");
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

	public void delete(MatchBillFeeRecord persistentInstance)
	{
		log.debug("deleting MatchBillFeeRecord instance");
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

	public MatchBillFeeRecord merge(MatchBillFeeRecord detachedInstance)
	{
		log.debug("merging MatchBillFeeRecord instance");
		try
		{
			MatchBillFeeRecord result = (MatchBillFeeRecord) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public MatchBillFeeRecord findById(deefw.MatchBillFeeRecordId id)
	{
		log.debug("getting MatchBillFeeRecord instance with id: " + id);
		try
		{
			MatchBillFeeRecord instance = (MatchBillFeeRecord) sessionFactory.getCurrentSession()
					.get("deefw.MatchBillFeeRecord", id);
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

	public List<MatchBillFeeRecord> findByExample(MatchBillFeeRecord instance)
	{
		log.debug("finding MatchBillFeeRecord instance by example");
		try
		{
			List<MatchBillFeeRecord> results = (List<MatchBillFeeRecord>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.MatchBillFeeRecord").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
