package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1918 {

    @Ignore    private SampleClass1919 sampleClass;

    public SampleClass1918(){
        sampleClass = new SampleClass1919();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}