package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass898 {

    @Ignore    private SampleClass899 sampleClass;

    public SampleClass898(){
        sampleClass = new SampleClass899();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}