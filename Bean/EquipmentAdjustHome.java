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
 * Home object for domain model class EquipmentAdjust.
 * @see deefw.EquipmentAdjust
 * @author Hibernate Tools
 */
public class EquipmentAdjustHome
{

	private static final Log log = LogFactory.getLog(EquipmentAdjustHome.class);

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

	public void persist(EquipmentAdjust transientInstance)
	{
		log.debug("persisting EquipmentAdjust instance");
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

	public void attachDirty(EquipmentAdjust instance)
	{
		log.debug("attaching dirty EquipmentAdjust instance");
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

	public void attachClean(EquipmentAdjust instance)
	{
		log.debug("attaching clean EquipmentAdjust instance");
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

	public void delete(EquipmentAdjust persistentInstance)
	{
		log.debug("deleting EquipmentAdjust instance");
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

	public EquipmentAdjust merge(EquipmentAdjust detachedInstance)
	{
		log.debug("merging EquipmentAdjust instance");
		try
		{
			EquipmentAdjust result = (EquipmentAdjust) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public EquipmentAdjust findById(int id)
	{
		log.debug("getting EquipmentAdjust instance with id: " + id);
		try
		{
			EquipmentAdjust instance = (EquipmentAdjust) sessionFactory.getCurrentSession().get("deefw.EquipmentAdjust",
					id);
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

	public List<EquipmentAdjust> findByExample(EquipmentAdjust instance)
	{
		log.debug("finding EquipmentAdjust instance by example");
		try
		{
			List<EquipmentAdjust> results = (List<EquipmentAdjust>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.EquipmentAdjust").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
