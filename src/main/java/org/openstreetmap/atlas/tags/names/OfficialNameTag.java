package org.openstreetmap.atlas.tags.names;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.Tag.Validation;
import org.openstreetmap.atlas.tags.annotations.TagKey;
import org.openstreetmap.atlas.tags.annotations.TagKey.KeyType;

/**
 * OSM official_name tag
 *
 * @author cstaylor
 */
@Tag(value = Validation.NON_EMPTY_STRING, taginfo = "http://taginfo.openstreetmap.org/keys/official_name#values", osm = "http://wiki.openstreetmap.org/wiki/Key:name")
public interface OfficialNameTag
{
    @TagKey(KeyType.LOCALIZED)
    String KEY = "official_name";
}
