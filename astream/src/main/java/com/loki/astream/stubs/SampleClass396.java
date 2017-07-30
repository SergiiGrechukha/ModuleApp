package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass396 {

    @Ignore    private SampleClass397 sampleClass;

    public SampleClass396(){
        sampleClass = new SampleClass397();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}