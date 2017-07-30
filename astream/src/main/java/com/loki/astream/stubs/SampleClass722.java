package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass722 {

    @Ignore    private SampleClass723 sampleClass;

    public SampleClass722(){
        sampleClass = new SampleClass723();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}