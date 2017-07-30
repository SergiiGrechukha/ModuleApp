package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass370 {

    @Ignore    private SampleClass371 sampleClass;

    public SampleClass370(){
        sampleClass = new SampleClass371();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}