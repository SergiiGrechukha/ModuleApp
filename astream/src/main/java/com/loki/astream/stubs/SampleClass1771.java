package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1771 {

    @Ignore    private SampleClass1772 sampleClass;

    public SampleClass1771(){
        sampleClass = new SampleClass1772();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}