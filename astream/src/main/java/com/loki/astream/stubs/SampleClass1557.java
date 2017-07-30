package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1557 {

    @Ignore    private SampleClass1558 sampleClass;

    public SampleClass1557(){
        sampleClass = new SampleClass1558();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}