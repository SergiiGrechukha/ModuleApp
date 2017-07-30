package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass916 {

    @Ignore    private SampleClass917 sampleClass;

    public SampleClass916(){
        sampleClass = new SampleClass917();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}