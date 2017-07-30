package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1658 {

    @Ignore    private SampleClass1659 sampleClass;

    public SampleClass1658(){
        sampleClass = new SampleClass1659();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}