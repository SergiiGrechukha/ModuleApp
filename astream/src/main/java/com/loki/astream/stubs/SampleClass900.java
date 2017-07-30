package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass900 {

    @Ignore    private SampleClass901 sampleClass;

    public SampleClass900(){
        sampleClass = new SampleClass901();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}