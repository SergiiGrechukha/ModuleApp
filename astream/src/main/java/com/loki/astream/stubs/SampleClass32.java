package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass32 {

    @Ignore    private SampleClass33 sampleClass;

    public SampleClass32(){
        sampleClass = new SampleClass33();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}