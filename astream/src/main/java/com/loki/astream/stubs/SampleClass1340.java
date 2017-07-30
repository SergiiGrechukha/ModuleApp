package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1340 {

    @Ignore    private SampleClass1341 sampleClass;

    public SampleClass1340(){
        sampleClass = new SampleClass1341();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}