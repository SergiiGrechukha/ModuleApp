package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1167 {

    @Ignore    private SampleClass1168 sampleClass;

    public SampleClass1167(){
        sampleClass = new SampleClass1168();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}