package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1696 {

    @Ignore    private SampleClass1697 sampleClass;

    public SampleClass1696(){
        sampleClass = new SampleClass1697();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}