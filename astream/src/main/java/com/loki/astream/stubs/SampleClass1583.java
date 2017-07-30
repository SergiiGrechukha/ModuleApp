package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1583 {

    @Ignore    private SampleClass1584 sampleClass;

    public SampleClass1583(){
        sampleClass = new SampleClass1584();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}