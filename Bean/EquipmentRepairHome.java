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
 * Home object for domain model class EquipmentRepair.
 * @see deefw.EquipmentRepair
 * @author Hibernate Tools
 */
public class EquipmentRepairHome
{

	private static final Log log = LogFactory.getLog(EquipmentRepairHome.class);

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

	public void persist(EquipmentRepair transientInstance)
	{
		log.debug("persisting EquipmentRepair instance");
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

	public void attachDirty(EquipmentRepair instance)
	{
		log.debug("attaching dirty EquipmentRepair instance");
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

	public void attachClean(EquipmentRepair instance)
	{
		log.debug("attaching clean EquipmentRepair instance");
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

	public void delete(EquipmentRepair persistentInstance)
	{
		log.debug("deleting EquipmentRepair instance");
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

	public EquipmentRepair merge(EquipmentRepair detachedInstance)
	{
		log.debug("merging EquipmentRepair instance");
		try
		{
			EquipmentRepair result = (EquipmentRepair) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public EquipmentRepair findById(int id)
	{
		log.debug("getting EquipmentRepair instance with id: " + id);
		try
		{
			EquipmentRepair instance = (EquipmentRepair) sessionFactory.getCurrentSession().get("deefw.EquipmentRepair",
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

	public List<EquipmentRepair> findByExample(EquipmentRepair instance)
	{
		log.debug("finding EquipmentRepair instance by example");
		try
		{
			List<EquipmentRepair> results = (List<EquipmentRepair>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.EquipmentRepair").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
