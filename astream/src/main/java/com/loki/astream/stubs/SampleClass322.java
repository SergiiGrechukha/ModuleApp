package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass322 {

    @Ignore    private SampleClass323 sampleClass;

    public SampleClass322(){
        sampleClass = new SampleClass323();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}