package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass917 {

    @Ignore    private SampleClass918 sampleClass;

    public SampleClass917(){
        sampleClass = new SampleClass918();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}