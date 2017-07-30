package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1727 {

    @Ignore    private SampleClass1728 sampleClass;

    public SampleClass1727(){
        sampleClass = new SampleClass1728();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}