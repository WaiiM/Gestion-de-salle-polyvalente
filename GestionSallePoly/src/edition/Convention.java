package edition;

import com.itextpdf.text.Paragraph;

import reservation.Reservation;

public class Convention {
  public static Paragraph title = new Paragraph("Convention d'utilisation");
  public Paragraph nom;
  public Paragraph mairie;
  public Paragraph article1, article2;
  public Paragraph loyer;
  public static Paragraph reglement = new Paragraph("La réservation d'une salle engendre une édition de d’une convention qui respecte une réglementation qui elle même se doit de :");
  public static Paragraph p1 = new Paragraph("Préserver la tranquillité publique : \r\n" + 
      "Lutter contre les bruits de voisinage\r\n" + 
      "Code de l’urbanisme : instruction du permis de construire\r\n" + 
      "Limiter certaines activités dans le temps (ex : les tondeuses à gazon, horaires d’accès à une salle communale).\r\n" + 
      "Réglementer la pratique de loisirs (ex : aéromodélisme)\r\n" + 
      "Restreindre des activités professionnelles (ex : fixer une heure de fermeture des discothèques sur sa commune plus restrictive que l’arrêté préfectoral, interdire les travaux de chantier ou de construction pendant l’été)\r\n" + 
      "Le maintien du bon ordre dans les endroits où il se fait de grands rassemblements d’hommes (tels que les foires, marchés, réjouissances et cérémonies publiques, spectacles, jeux, cafés, églises etc.).\r\n" + 
      "");
  public static Paragraph p2 = new Paragraph("Protéger la santé publique :\r\n" + 
      "Limiter le niveau sonore, le niveau sonore, mesuré sur une période comprise entre 10 et 15 minutes, ne doit pas dépasser 105 dB (A).\r\n" + 
      "Les manquements à cette limitation sont punis par une contravention de cinquième classe (1500€ pouvant être doublée en cas de récidive).\r\n" + 
      "");
  public static Paragraph p3 = new Paragraph("Si le projet communal envisage d’en créer une ou d’acquérir un bâtiment existant pour le transformer en salle des fêtes, des mesures préventives et/ou de protection dans le temps sont nécessaires.");
  public static Paragraph p4 = new Paragraph("Principe : ne pas prévoir ce type de bâtiment dans un milieu à forte densité d’habitation.");
  public static Paragraph p5 = new Paragraph("Lorsque le bâtiment existe déjà depuis longtemps, que son utilisation a évolué au fil des années et que la commune n’a pas les moyens financiers de faire une salle des fêtes ailleurs, des solutions peuvent être recherchées parmi celles exposées ci-après. Une grande vigilance s’impose alors aux élus.");
  
  public Convention(Reservation r) {
    mairie = new Paragraph("Entre: La ville de Brest, representé par M. Bla bla");
    nom = new Paragraph("Et: "+r.getOccupant().getName());
    article1 = new Paragraph("Article 1 : Loyer et charge");
    loyer = new Paragraph("1200€");
    article2 = new Paragraph("Article 2 : Reglémentations");
  }
}
