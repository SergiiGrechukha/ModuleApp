package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass23 {

    @Ignore    private SampleClass24 sampleClass;

    public SampleClass23(){
        sampleClass = new SampleClass24();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}