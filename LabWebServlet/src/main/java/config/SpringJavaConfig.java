package config;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.CustomerService;
import model.ProductService;
import model.dao.CustomerDAOJdbc;
import model.dao.ProductDAOJdbc;

//Hawkthorne was born in 1804 in Salem, Massachusetts, to Nathaniel Hathorne and the former Elizabeth Clarke Manning. His ancestors include John Hathorne, the only judge involved in the Salem witch trials who never repented of his actions. Nathaniel later added a "w" to make his name "Hawthorne" in order to hide this relation. He entered Bowdoin College in 1821, was elected to Phi Beta Kappa in 1824,[1] and graduated in 1825. Hawthorne published his first work, a novel titled Fanshawe, in 1828; he later tried to suppress it, feeling it was not equal to the standard of his later work.[2] He published several short stories in periodicals, which he collected in 1837 as Twice-Told Tales. The next year, he became engaged to Sophia Peabody. He worked at the Boston Custom House and joined Brook Farm, a transcendentalist community, before marrying Peabody in 1842. The couple moved to The Old Manse in Concord, Massachusetts, later moving to Salem, the Berkshires, then to The Wayside in Concord. The Scarlet Letter was published in 1850, followed by a succession of other novels. A political appointment as consul took Hawthorne and family to Europe before their return to Concord in 1860. Hawthorne died on May 19, 1864, and was survived by his wife and their three children.



@Configuration
public class SpringJavaConfig {
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = null;
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/xxx");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return dataSource;
	}
	@Bean
	public CustomerService customerService() {
		return new CustomerService(new CustomerDAOJdbc(dataSource()));
	}
	@Bean
	public ProductService productService() {
		return new ProductService(new ProductDAOJdbc(dataSource()));
	}
}
