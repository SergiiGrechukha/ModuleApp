package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1606 {

    @Ignore    private SampleClass1607 sampleClass;

    public SampleClass1606(){
        sampleClass = new SampleClass1607();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}