package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1275 {

    @Ignore    private SampleClass1276 sampleClass;

    public SampleClass1275(){
        sampleClass = new SampleClass1276();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}