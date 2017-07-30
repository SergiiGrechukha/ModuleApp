package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1733 {

    @Ignore    private SampleClass1734 sampleClass;

    public SampleClass1733(){
        sampleClass = new SampleClass1734();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}