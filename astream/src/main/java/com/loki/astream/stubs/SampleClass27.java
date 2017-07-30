package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass27 {

    @Ignore    private SampleClass28 sampleClass;

    public SampleClass27(){
        sampleClass = new SampleClass28();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}