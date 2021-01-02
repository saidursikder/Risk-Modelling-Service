-- model data
insert into model values ('1', 'model1', 'hull');
insert into model values ('2', 'model2', 'pandi');

-- vessel score data for a particular model
insert into vessel_model_score values (8917730, 4, 2, 1, '1');
insert into vessel_model_score values (9190030, 2, 2, 4, '2');


-- benchmark feature scores
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (1, 'summed_posterior_risk', 0.013379823297156396, 1, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (2, 'summed_posterior_risk', 0.008669662466144807, 2, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (3, 'summed_posterior_risk', 0.007636504528374549, 3, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (4, 'summed_posterior_risk', 0.007438055085727208, 4, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (5, 'summed_posterior_risk', 0.007228163789309734, 5, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (6, 'summed_posterior_risk', 0.007286073191403593, 6, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (7, 'summed_posterior_risk', 0.006816882289278001, 7, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (8, 'summed_posterior_risk', 0.005859767596986097, 8, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (9, 'summed_posterior_risk', 0.005688460581073381, 9, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (10, 'summed_posterior_risk', 0.007057421562531943, 10, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (11, 'depth', 12.471841544117678, 1, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (12, 'depth', 12.734683328937004, 2, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (13, 'depth', 13.026388769189369, 3, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (14, 'depth', 13.249205282112921, 4, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (15, 'depth', 12.781638318401116, 5, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (16, 'depth', 11.723994101744925, 6, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (17, 'depth', 9.946366938515938, 7, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (18, 'depth', 8.485815055832543, 8, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (19, 'depth', 7.176507163217436, 9, '1');
insert into BENCHMARK_VESSEL_FEATURE_SCORE values (20, 'depth', 6.901290742075982, 10, '1');


-- feature dictionary
insert into FEATURE_DICTIONARY  values (1, 'Sum of port risk of visited ports last 12 month', 'Sum of port risk', 'summed_posterior_risk', 'value', '1');
insert into FEATURE_DICTIONARY  values (2, 'Distance between the lowest point of the hull, ordinarily from the bottom of the keel, to the side of any deck', 'Depth', 'depth', 'meters', '1');
insert into FEATURE_DICTIONARY  values (3, 'Age of the vessel in years', 'Age', 'age', 'years', '1');
insert into FEATURE_DICTIONARY  values (4, 'Fleet size beneficial Owner', 'Fleet size beneficial Owner', 'current_unique_imo_group_beneficial_owner', 'number', '1');
insert into FEATURE_DICTIONARY  values (5, 'Average monthly distance travelled by the vessel', 'Average distance per month', 'average_distance_per_month', 'nm', '1');
insert into FEATURE_DICTIONARY  values (6, 'Fleet size Technical Manager', 'Fleet size Technical Manager', 'current_unique_imo_technical_manager', 'number', '1');
insert into FEATURE_DICTIONARY  values (7, 'Number of port visits last 12 months', 'Number of port visits', 'number_of_port_visits', 'number', '1');
insert into FEATURE_DICTIONARY  values (8, 'Total contents of a ship including cargo, fuel, crew, passengers, food, and water aside from boiler water', 'Deadweight', 'deadweight', 'tonnes', '1');
insert into FEATURE_DICTIONARY  values (9, 'Average port risks values. It is based on the amount of casualties around a port per 10k port visits with smoothing applied for ports with a low amount of port visits.', 'Average port risk', 'avg_posterior_risk', 'value', '1');
insert into FEATURE_DICTIONARY  values (10, 'Average time spent in Northern Europe', 'Average time spent in Northern Europe', 'avg_time_hour_subregion_northern_europe', 'hours', '1');
insert into FEATURE_DICTIONARY  values (11, 'The size or carrying capacity of a ship measured in gross tons', 'Gross tonnage', 'grosstonnage', 'tonnes', '1');
insert into FEATURE_DICTIONARY  values (12, 'Age of the vessel in years', 'Age', 'age', 'years', '1');


-- feature values for a particular model
insert into VESSEL_FEATURE_VALUE  values (1,'summed_posterior_risk', 0.0007505506716022883, 9190030, -12533.103, 'Crew Boat', '1');
insert into VESSEL_FEATURE_VALUE  values (2, 'summed_posterior_risk', 0.011719218719778966, 8917730, -4913.2725, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (3, 'depth', 8, 8917730, 3035.3633, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (4, 'current_unique_imo_group_beneficial_owner', 0, 8917730, 3998.8901, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (5, 'average_distance_per_month', 1898.44, 8917730, -3864.1797, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (6, 'current_unique_imo_technical_manager', 2, 8917730, -14803.813, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (7, 'number_of_port_visits', 238, 8917730, 27879.123, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (8,'deadweight', 4452, 8917730, 28506.713, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (9, 'avg_posterior_risk', 0.00004924041478898725, 8917730, -50258.14, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (10, 'avg_time_hour_subregion_northern_europe', 0, 8917730, 8322.802, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (11, 'grosstonnage', 3828, 8917730, 37068.96, 'General Cargo Ship', '1');
insert into VESSEL_FEATURE_VALUE  values (12, 'age', 29, 8917730, 10931.7295, 'General Cargo Ship', '1');


-- vessel type feature values
insert into VESSEL_TYPE_FEATURE_VALUE values (1, 0.007966073653782194, 'summed_posterior_risk', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (2, 0.0075548801314959495, 'summed_posterior_risk', 'Crew Boat', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (3, 8.53638110236225, 'depth', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (4, 69.67970926711084, 'current_unique_imo_group_beneficial_owner', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (5, 164.1258631132647, 'number_of_port_visits', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (6, 2601.164152634769, 'average_distance_per_month', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (7, 18.353482737734705, 'current_unique_imo_technical_manager', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (8, 8181.789884278339, 'deadweight', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (9, 0.000054709061445602107, 'avg_posterior_risk', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (10, 53.68101150817691, 'avg_time_hour_subregion_northern_europe', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (11, 5718.632828588734, 'grosstonnage', 'General Cargo Ship', '1');
insert into VESSEL_TYPE_FEATURE_VALUE values (12, 20.734221683827982, 'age', 'General Cargo Ship', '1');

