package kickstart;

import static org.joda.money.CurrencyUnit.EUR;

import javax.annotation.PostConstruct;

import kickstart.controller.Article;
import kickstart.controller.Sortiment;

import org.joda.money.Money;
import org.salespointframework.core.DataInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class KickstartDataInitializer implements DataInitializer{
	
	private final Sortiment sortiment;
	
	@Autowired
	public KickstartDataInitializer(Sortiment sortiment){
		this.sortiment = sortiment;
	}

	@Override
	public void initialize() {
		
		
	sortiment.save(new Article("Claude Chatelier Extra", "20 Jahre", Money.of(EUR, 46.95), "40,0 %","1.0 Liter", "Cognac"));
	sortiment.save(new Article("Chatelier Cognac", "8 Jahre", Money.of(EUR, 41.90 ), "40,0 %","0,7 Liter","Cognac"));
	sortiment.save(new Article("Courvoisier Napoleon ", "5 Jahre", Money.of(EUR, 79.90), "40,0 %","0,7 Liter","Cognac"));
	sortiment.save(new Article("Delamain Vesper", "35 Jahre", Money.of(EUR, 97.95), "40,0 %","0,7 Liter","Cognac"));
	sortiment.save(new Article("Frapin Domaine Château de Fontpinot", "5 Jahre", Money.of(EUR, 46.95), "30,0 %","1,0 Liter","Cognac"));

	}

}
