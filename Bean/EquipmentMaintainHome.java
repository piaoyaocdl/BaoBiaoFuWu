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
 * Home object for domain model class EquipmentMaintain.
 * @see deefw.EquipmentMaintain
 * @author Hibernate Tools
 */
public class EquipmentMaintainHome
{

	private static final Log log = LogFactory.getLog(EquipmentMaintainHome.class);

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

	public void persist(EquipmentMaintain transientInstance)
	{
		log.debug("persisting EquipmentMaintain instance");
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

	public void attachDirty(EquipmentMaintain instance)
	{
		log.debug("attaching dirty EquipmentMaintain instance");
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

	public void attachClean(EquipmentMaintain instance)
	{
		log.debug("attaching clean EquipmentMaintain instance");
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

	public void delete(EquipmentMaintain persistentInstance)
	{
		log.debug("deleting EquipmentMaintain instance");
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

	public EquipmentMaintain merge(EquipmentMaintain detachedInstance)
	{
		log.debug("merging EquipmentMaintain instance");
		try
		{
			EquipmentMaintain result = (EquipmentMaintain) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public EquipmentMaintain findById(int id)
	{
		log.debug("getting EquipmentMaintain instance with id: " + id);
		try
		{
			EquipmentMaintain instance = (EquipmentMaintain) sessionFactory.getCurrentSession()
					.get("deefw.EquipmentMaintain", id);
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

	public List<EquipmentMaintain> findByExample(EquipmentMaintain instance)
	{
		log.debug("finding EquipmentMaintain instance by example");
		try
		{
			List<EquipmentMaintain> results = (List<EquipmentMaintain>) sessionFactory.getCurrentSession()
					.createCriteria("deefw.EquipmentMaintain").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
