package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1525 {

    @Ignore    private SampleClass1526 sampleClass;

    public SampleClass1525(){
        sampleClass = new SampleClass1526();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}