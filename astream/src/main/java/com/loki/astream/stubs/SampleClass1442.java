package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1442 {

    @Ignore    private SampleClass1443 sampleClass;

    public SampleClass1442(){
        sampleClass = new SampleClass1443();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}