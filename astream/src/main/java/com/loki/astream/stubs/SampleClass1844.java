package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1844 {

    @Ignore    private SampleClass1845 sampleClass;

    public SampleClass1844(){
        sampleClass = new SampleClass1845();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}