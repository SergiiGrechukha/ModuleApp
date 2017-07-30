package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass635 {

    @Ignore    private SampleClass636 sampleClass;

    public SampleClass635(){
        sampleClass = new SampleClass636();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}