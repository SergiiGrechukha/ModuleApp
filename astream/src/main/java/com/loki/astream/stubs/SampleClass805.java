package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass805 {

    @Ignore    private SampleClass806 sampleClass;

    public SampleClass805(){
        sampleClass = new SampleClass806();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}