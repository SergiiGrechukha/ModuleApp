package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1260 {

    @Ignore    private SampleClass1261 sampleClass;

    public SampleClass1260(){
        sampleClass = new SampleClass1261();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}