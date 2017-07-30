package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass348 {

    @Ignore    private SampleClass349 sampleClass;

    public SampleClass348(){
        sampleClass = new SampleClass349();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}