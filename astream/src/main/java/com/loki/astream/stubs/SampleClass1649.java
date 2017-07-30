package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1649 {

    @Ignore    private SampleClass1650 sampleClass;

    public SampleClass1649(){
        sampleClass = new SampleClass1650();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}