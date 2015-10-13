package br.com.utfpr.ajudanovatos.entidades.projeto;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contribuinte.class)
public abstract class Contribuinte_ {

	public static volatile SingularAttribute<Contribuinte, String> primary_language_nice_name;
	public static volatile SingularAttribute<Contribuinte, String> first_commit_time;
	public static volatile SingularAttribute<Contribuinte, String> contributor_name;
	public static volatile SingularAttribute<Contribuinte, Integer> commits;
	public static volatile SingularAttribute<Contribuinte, Long> id;
	public static volatile SingularAttribute<Contribuinte, String> last_commit_time;
	public static volatile SingularAttribute<Contribuinte, Integer> man_months;
	public static volatile SingularAttribute<Contribuinte, Long> contributor_id;

}

