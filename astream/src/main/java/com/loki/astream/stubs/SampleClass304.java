package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass304 {

    @Ignore    private SampleClass305 sampleClass;

    public SampleClass304(){
        sampleClass = new SampleClass305();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}