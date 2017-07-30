package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1410 {

    @Ignore    private SampleClass1411 sampleClass;

    public SampleClass1410(){
        sampleClass = new SampleClass1411();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}