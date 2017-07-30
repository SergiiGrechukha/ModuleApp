package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1396 {

    @Ignore    private SampleClass1397 sampleClass;

    public SampleClass1396(){
        sampleClass = new SampleClass1397();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}