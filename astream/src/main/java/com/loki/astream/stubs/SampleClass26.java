package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass26 {

    @Ignore    private SampleClass27 sampleClass;

    public SampleClass26(){
        sampleClass = new SampleClass27();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}