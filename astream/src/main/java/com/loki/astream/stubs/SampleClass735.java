package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass735 {

    @Ignore    private SampleClass736 sampleClass;

    public SampleClass735(){
        sampleClass = new SampleClass736();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}