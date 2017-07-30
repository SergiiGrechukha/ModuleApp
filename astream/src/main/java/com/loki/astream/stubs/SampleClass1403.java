package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1403 {

    @Ignore    private SampleClass1404 sampleClass;

    public SampleClass1403(){
        sampleClass = new SampleClass1404();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}