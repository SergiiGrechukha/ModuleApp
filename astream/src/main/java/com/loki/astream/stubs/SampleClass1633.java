package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1633 {

    @Ignore    private SampleClass1634 sampleClass;

    public SampleClass1633(){
        sampleClass = new SampleClass1634();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}