package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1786 {

    @Ignore    private SampleClass1787 sampleClass;

    public SampleClass1786(){
        sampleClass = new SampleClass1787();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}