/*
 * Copyright 2020 etrace.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.etrace.api.model.po.ui;

import io.etrace.api.model.Target;
import io.etrace.api.model.po.BaseItem;
import io.etrace.api.model.po.BasePersistentObject;
import io.etrace.api.util.JpaConverterJson;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.annotation.Nullable;
import javax.persistence.Convert;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "chart")
@Data
@EqualsAndHashCode(callSuper = true)
public class ChartPO extends BaseItem {

    private String config;

    @Convert(converter = JpaConverterJson.class)
    private List<Target> targets;

    @Nullable
    private String title;
    private String description;
    private String status;

    @Nullable
    private String createdBy;
    @Nullable
    private String updatedBy;
}

