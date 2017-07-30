package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass333 {

    @Ignore    private SampleClass334 sampleClass;

    public SampleClass333(){
        sampleClass = new SampleClass334();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}