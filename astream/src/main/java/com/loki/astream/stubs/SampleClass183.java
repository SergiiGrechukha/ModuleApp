package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass183 {

    @Ignore    private SampleClass184 sampleClass;

    public SampleClass183(){
        sampleClass = new SampleClass184();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}