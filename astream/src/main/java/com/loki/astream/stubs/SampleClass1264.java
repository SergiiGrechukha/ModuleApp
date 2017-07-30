package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1264 {

    @Ignore    private SampleClass1265 sampleClass;

    public SampleClass1264(){
        sampleClass = new SampleClass1265();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}